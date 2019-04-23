<?php

namespace App\Http\Middleware;

use Session;
use Closure;

class isLembaga
{
	/**
     * Handle an incoming request.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \Closure  $next
     * @return mixed
     */
    public function handle($request, Closure $next)
    {
		if (Session::get('level') == 'lembaga') {
			return $next($request);
		}
		return redirect('/');
	}
}
